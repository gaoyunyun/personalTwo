<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common/head.jsp"%>
<div class="right_cont">
	<h3>
		<strong>个人资料</strong>
	</h3>
	<div class="user_hr"></div>
	<div class="header">
		<input type="hidden" id="picPath" value="${user.picPath}" />
		<div id="thisImage"></div>
		<form method="post" enctype="multipart/form-data">
			<p class="modify">
				<input type="file" class="file" id="file" /><a href="javascript:;"
					id="queryImg">修改头像</a>
			</p>
		</form>
	</div>
	<div class="right_c">
		<div class="right_info">
			<div class="id_card">
				<span class="id_name"> ID：${user.userName} </span>
			</div>
		</div>
		<div class="csdn_info">
			<span
				style="margin-right: 16px; color: rgb(77, 77, 77); font-size: 14px;">
				关注 ${user.concern} </span> <span
				style="margin-right: 16px; color: rgb(77, 77, 77); font-size: 14px;">
				粉丝 ${user.fans} </span> <span class="splits"> | &nbsp;&nbsp;&nbsp;</span> <span
				style="margin-right: 8px; color: rgb(77, 77, 77); font-size: 14px;">
				C币 ${user.ccoin} </span> <a href="javascript:;" class="charge" data-toggle="modal"
				data-target="#myModal">充值</a><br />
			<div class="user_hr2"></div>
		</div>
		<ul class="self">
			<li>昵称：${detail.nickName}</li>
			<li>实名：${detail.realName}</li>
			<li>性别：${detail.sex==0?"男":"女"}</li>
			<li>生日：${detail.birthday}</li>
			<li>地区：${detail.region}</li>
			<li>行业：${detail.industry}</li>
			<li>职位：${detail.position}</li>
			<li><span>简介：</span> <span>${detail.introduction}</span></li>
		</ul>
	</div>
</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h3 class="modal-title" id="myModalLabel"><img src="<%=basePath%>static/images/user.jpg" style="width:32px;height:32px;margin-top:-10px;"/>&nbsp;&nbsp;二维码收款</h3>
			</div>
			<div class="modal-body" style="text-align:center; font-size:16px;font-weight:800;margin-top:20px;">无须加好友，扫二维码向我付钱</div>
			<div class="modal-body" style="text-align:center;"><img src="<%=basePath%>static/images/money.jpg" style="width:220px;height:220px;border:1px solid #E0E0E0;padding:2px;"/></div>
			<div class="modal-body" style="text-align:center;margin-bottom:20px;"><img src="<%=basePath%>static/images/weixin.png" style="width:40px;height:30px;margin-top:-2px;"/>&nbsp;微信扫码</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<!--<button type="button" class="btn btn-primary">提交更改</button>-->
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal -->
</div>
<script>
$(document).ready(function() {
	//显示头像
    var picPath = document.getElementById("picPath").value;
    var queryImg = document.getElementById("queryImg");
    if (picPath == null || picPath == "") {
        $("#thisImage").html('');
    } else {
    	$("#thisImage").append("<img class=\"head\" src=\"" + "<%=basePath%>"+ picPath + "\"/>");
	}
    //点击超链接触发头像上传
    $("#queryImg").bind("click",function(){
    	if($("#file").click()){
    		if($("#file").val()==''||$("#file").val()==null){
    			$("#file").change();
    		}
    	}	
    });
    //头像上传
    $("#file").change(function() {
        var animateimg = $("#file").val(); //获取上传的图片路径
        var imgarr = animateimg.split('\\'); //分割
        var myimg = imgarr[imgarr.length - 1]; //去掉 // 获取图片名
        var houzui = myimg.lastIndexOf('.'); //获取 . 出现的位置
        var ext = myimg.substring(houzui, myimg.length).toUpperCase(); //切割 . 获取文件后缀
        var file = $('#file').get(0).files[0]; //获取上传的文件
        var fileSize = file.size; //获取上传的文件大小
        var maxSize = 1048576;
        if (ext != '.PNG' && ext != '.GIF' && ext != '.JPG' && ext != '.JPEG' && ext != '.BMP') {
            alert('文件类型错误,请上传图片类型');
            return false;
        } else if (parseInt(fileSize) >= parseInt(maxSize)) {
            alert('上传的文件不能超过1MB');
            return false;
        } else {
            //上传请求
            var formData = new FormData();
            formData.append("file", file);
            $.ajax({
                type: "POST", //请求类型
                url: "<%=basePath%>queryImg",
															data : formData, //请求参数
															contentType : false,
															processData : false, //这个很有必要，不然不行
															success : function(
																	data) {
																if (data.result == "true") {
																	location
																			.reload();
																}
																if (data.result == "false") {
																	alert("亲,修改头像失败了");
																}
															},
															error : function(
																	data) { //当访问时候，404，500 等非200的错误状态码
																alert("亲,修改头像失败了");
															}
														});
											}
										});
					});
</script>
<%@ include file="common/foot.jsp"%>