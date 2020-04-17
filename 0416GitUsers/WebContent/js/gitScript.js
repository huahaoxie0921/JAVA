$(document).ready(
		function() {

			$.ajax({

				url : "https://api.github.com/users"

			}).then(
					function(data) {
						// console.log(data);
						var table = $("#usersTable");
						var contents = "";
						$.each(data, function(idx) {

							contents += "<tr class='content'>";
							contents += "<td>" + data[idx].id + "</td>";
							contents += "<td>" + data[idx].login + "</td>";
							contents += "<td>" + data[idx].followers_url
									+ "</td>";
							contents += "<td>" + 0 + "</td>";
							contents += "<td><img src='" + data[idx].avatar_url
									+ "' width=50 height=50 /></td>";
							contents += "</tr>";
						})
						table.append(contents);
						$(".content").click(
								function() {
									var row = $(this).closest("tr");
									var followers_URL = row.find(
											"td:nth-child(3)").html();
									$.ajax({
										url : followers_URL,
									}).then(
											function(fData) {
												// console.log(fData.length);
												row.find("td:nth-child(4)")
														.html(fData.length);
											})
								})
					});

		});
