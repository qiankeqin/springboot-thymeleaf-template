$(function () {
    $(window).on('load', function () {
        $('.selectpicker').selectpicker('val', '');
        $('.selectpicker').selectpicker('refresh');
    });

    //下拉数据加载
    $.ajax({
        type: 'get',
        url: "/settleNew/channellist",
        dataType: 'json',
        success: function (datas) {//返回list数据并循环获取
            var select = $("#slpk");
            for (var i = 0; i < datas.length; i++) {
                select.append("<option value='" + datas[i].id + "'>"
                    + datas[i].name + "</option>");
            }
            $('.selectpicker').selectpicker('val', '');
            $('.selectpicker').selectpicker('refresh');
        }
    });


    // 添加清算条目
    $("#saveSettleRecord").on('click', function () {
        console.log('saveSettleRecord');
        var id = $("#settle_id").val();
        // console.info(id);
        var settle_date = $("#settle_date").val();
        var channelId = $('#slpk').selectpicker('val')
        var amount = $("#amount").val()
        var benefitAmount = $("#benefitAmount").val()
        var supplyAmount = $("#supplyAmount").val()
        var remark = $("#remark").val()
        $("#addSettleRecordModal").find('input').val('')
        if (amount == "" || channelId == "") {
            bootbox.alert("请填写金额并选择渠道！");
        } else {
            //遮罩层
            var dialog = bootbox.dialog({
                title: '提示',
                message: '<p><i class="fa fa-spin fa-spinner"></i>保存中，请等待。。。</p>',
                closeButton: false
            });
            $.ajax({
                type: "GET",
                url: "/settleNew/saveSettleRecord?settle_id=" + id + "&channelId=" + channelId + "&amount=" + amount + "&settleDate=" + settle_date + "&benefitAmount=" + benefitAmount + "&supplyAmount=" + supplyAmount + "&remark=" + remark,
                dataType: "json",
                success: function (data) {
                    dialog.modal('hide');
                    if (data.status == "200") {
                        bootbox.alert("保存成功！");
                        //刷新
                        $("#settleList").bootstrapTable('refreshOptions', {});
                    } else {
                        bootbox.alert(data.msg);
                    }
                },
                error: function (jqXHR) {
                    dialog.modal('hide');
                    bootbox.alert("发生错误:" + jqXHR.status);
                }
            });
        }
    });

    $("#btn_generate_settle_file").on('click', function () {
        bootbox.confirm({
            message: "确定要生成清算文件吗？",
            buttons: {
                confirm: {
                    label: '确定'
                },
                cancel: {
                    label: '取消'
                }
            },
            callback: function (result) {
                if (result) {

                    var settle_date = $("#settle_date").val();
                    //遮罩层
                    var dialog = bootbox.dialog({
                        title: '提示',
                        message: '<p><i class="fa fa-spin fa-spinner"></i>生成并上传文件中，请等待。。。</p>',
                        closeButton: false
                    });
                    $.ajax({
                        type: "GET",
                        url: "/settleNew/generateSettleFile?settle_date=" + settle_date,
                        dataType: "json",
                        success: function (data) {
                            dialog.modal('hide');
                            if (data.status == "200") {
                                bootbox.alert("清算文件生成并上传文件成功！");
                            } else {
                                bootbox.alert(data.msg);
                            }
                        },
                        error: function (jqXHR) {
                            dialog.modal('hide');
                            bootbox.alert("发生错误:" + jqXHR.status);
                        }
                    });
                }
            }
        });
    });


    $("#btn_generate_settle_data").on('click', function () {
        bootbox.confirm({
            message: "确定要生成清算数据吗？",
            buttons: {
                confirm: {
                    label: '确定'
                },
                cancel: {
                    label: '取消'
                }
            },
            callback: function (result) {
                if (result) {
                    var settle_date = $("#settle_date").val();
                    //遮罩层
                    var dialog = bootbox.dialog({
                        title: '提示',
                        message: '<p><i class="fa fa-spin fa-spinner"></i>生成清算数据中，请等待。。。</p>',
                        closeButton: false
                    });
                    $.ajax({
                        type: "GET",
                        url: "/settleNew/generateSettleData?settle_date=" + settle_date,
                        dataType: "json",
                        success: function (data) {
                            dialog.modal('hide');
                            if (data.status == "200") {
                                bootbox.alert("清算数据生成成功！");
                                //刷新
                                $("#settleList").bootstrapTable('refreshOptions', {});
                            } else {
                                bootbox.alert(data.msg);
                            }
                        },
                        error: function (jqXHR) {
                            dialog.modal('hide');
                            bootbox.alert("发生错误:" + jqXHR.status);
                        }
                    });
                }
            }
        });
    });

});


function delSettleRecord(id) {
    bootbox.confirm({
        message: "确定要删除吗？",
        buttons: {
            confirm: {
                label: '确定'
            },
            cancel: {
                label: '取消'
            }
        },
        callback: function (result) {
            if (result) {
                //遮罩层
                var dialog = bootbox.dialog({
                    title: '提示',
                    message: '<p><i class="fa fa-spin fa-spinner"></i>删除中，请等待。。。</p>',
                    closeButton: false
                });
                console.info(id);
                $.ajax({
                    url: "/settleNew/delSettleRecord?id=" + id,
                    dataType: "json",
                    type: "post",
                    contentType: "application/json",
                    success: function (data) {
                        dialog.modal('hide');
                        if (data.status == "200") {
                            bootbox.alert("删除成功！");
                            //刷新
                            $("#settleList").bootstrapTable('refreshOptions', {});
                        }
                        else {
                            bootbox.alert(data.msg);
                        }
                    },
                    error: function (data) {
                        dialog.modal('hide');
                        bootbox.alert("服务器错误");
                    }
                });
            }
        }
    });
};
