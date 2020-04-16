var appid = "7c153ad4f8ba6660c92f60ebd48ba95b";

function findByZipCode() {
    var zipcode = $("#zipcode").val();
    $("#temp_block").html("");
    $.ajax({
    url: "http://api.openweathermap.org/data/2.5/weather?zip=" + zipcode + ",us&appid=" + appid,
    type: "get",
    datatype: "jsonp",
    jsonp:"myCallback",
    success: function(data) {
        $("#temp_block").append("<h5>City Name: " + data.name + "<h5>");
        $("#temp_block").append("<h5>Temperature: " + data.main.temp + "<h5>");
        $("#temp_block").append("<h5>Max Temperature Today: " + data.main.temp_max + "<h5>");
        $("#temp_block").append("<h5>Min Temperature Today: " + data.main.temp_min + "<h5>");
        },
    error: function(response) {
        $("#temp_block").append("Invalid zip code, and the states code is " + response.status);
        $("#temp_block").append("<br>Please check your input and try again!");
        }
    })
}

function findCityName() {
    var lat = $("#lat").val();
    var lon = $("#lon").val();
    $("#city_block").html("");
    $.ajax({
    url: "http://api.openweathermap.org/data/2.5/find?lat=" + lat + "&lon=" + lon +"&cnt=10&appid=" + appid,
    type: "get",
    datatype: "jsonp",
    jsonp:"myCallback",
    success: function(citydata) {
        $("#city_block").append("<ui>City List");
        citydata.list.forEach(function(item, index, array){
            $("#city_block").append("<li>" + item.name + "</li>");
        })
        $("#city_block").append("</ui>");
        },
    error: function(response) {
        $("#city_block").append("Invalid latitude or longitude, the states code is " + response.status);
        $("#city_block").append("<br>Please check your input and try again!");
        }
    })
}