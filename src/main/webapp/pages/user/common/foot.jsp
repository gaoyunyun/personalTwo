<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--dataTables-->
<script>
	$(document).ready(function() {
		$('#example').dataTable();
	});
</script>
<script>
	$('#example').removeClass('display').addClass(
			'table table-striped table-bordered');
</script>
</body>
</html>