<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>STUDENT ADMISSION FORM</h1>

	<h1>${headerMessage }</h1>

	<form:errors path="student1.*" />
	<form action="/9_p9/submitAdmissionForm.html" method="post">
		<p>
			Student's Name : <input type="text" name="name" />
		</p>
		<p>
			Student's Hobby : <input type="text" name="hobby" />
		</p>
		<p>
			Student's Mobile : <input type="text" name="studentMobile" />
		</p>
		<p>
			Student's DOB : <input type="text" name="studentDOB" />
		</p>
		<p>
			Student's Skills set : <select name="studentSkills" multiple>
				<option value="Java Core">Java Core</option>
				<option value="Spring Core">Spring Core</option>
				<option value="Spring MVC">Spring MVC</option>
			</select>
		</p>
		<p>
			Student's street : <input type="text" name="adres.straat" />
		</p>
		<input type="submit" value="Submit this form" />
	</form>
</body>
</html>