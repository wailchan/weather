angular.module('demo', [])
.controller('Weather', function($scope, $http) {
    $http.get('http://localhost:8080/weather/weather').
        then(function(response) {
            $scope.weather = response.data;
        });
});