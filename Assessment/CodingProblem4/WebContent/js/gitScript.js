$(document).ready(
        function() {

            $.ajax({

                url : "https://api.github.com/users"

            }).then(
                    function(data) {
                        var table = $("#usersTable");
                        var contents = "";
                        $.each(data, function(idx) {

                            contents += "<tr class='username'>";
                            contents += "<td>" + data[idx].login + "</td>";
                            contents += "<td></td>";
                            contents += "</tr>";
                        })
                        table.append(contents);
                        $(".username").click(
                                function() {
                                    var row = $(this).closest("tr");
                                    row.find("td:nth-child(2)").html("");
                                    var username = row.find("td:nth-child(1)").html();
                                    var followers_URL = "https://api.github.com/users/"+ username +"/followers";
                                    $.ajax({
                                        url : followers_URL,
                                    }).then(
                                            function(fData) {
                                                $.each(fData, function(fIdx){
                                                    row.find("td:nth-child(2)").append("<img src='" + fData[fIdx].avatar_url + "' width=50 height=50 />");
                                                })
                                            })
                                })
                    });

        });

