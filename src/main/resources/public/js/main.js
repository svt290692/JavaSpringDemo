var app = angular.module("demo", []);

app.controller("AppCtrl", function ($scope, $http) {

    $scope.websites = [];

    $http({
        method: 'GET',
        url: 'api/mydemo'
    }).then(function (data) {
        $scope.websites = data.data;
    }, function (error) {

    });

});