<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<%@ include file="components/link.jsp"%>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div
		class="content_container py-4 d-flex flex-column justify-content-center align-items-center">
		<h3 class="text-white">Fill the feedback Form</h3>
		<form action = "<%=application.getContextPath()%>/feedback" method = "post" class="mt-3 text-white" 
		>
			<!-- email input -->
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" placeholder = "Enter here" class="form-control"
					name="email" id="exampleInputEmail1" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text text-white">We'll never share your
					email with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Phone Number</label>
				<input name = "phone" placeholder = "Enter Phone number"type="tel" class="form-control"
					id="exampleInputPassword1">
			</div>
			
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Your Feedback Message</label>
				<textarea name = "feedback_message" rows="10" cols="" placeholder = "Enter message here" class = "form-control"></textarea>
			</div>
			<div class = "container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
				<button type="reset" class="btn btn-light">Reset</button>
			</div>
			
		</form>
	</div>
	<%@ include file="script.jsp"%>
</body>
</html>