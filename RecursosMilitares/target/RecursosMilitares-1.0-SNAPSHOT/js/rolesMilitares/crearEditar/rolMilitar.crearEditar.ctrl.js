var rolMilitarModule = angular.module('rolMilitarModule');
//Asociar el controlador al modulo
rolMilitarModule.controller('crearEditarRolMilitarCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        var id = $state.params.rolMilitar;
        $scope.rolMilitar = {};
        if (id) {
            $http.get('api/roles_militares/' + id).then(function (response) {
                $scope.rolMilitar = response.data;
            }, function (error) {
                console.log(error);
            });
        }

        $scope.crearRolMilitar = function () {
            if ($scope.rolMilitar.nombreRol) {
                $http.post('api/roles_militares', JSON.stringify($scope.rolMilitar)).then(function (response) {
                    $scope.rolMilitar = {};
                    $state.reload();
                }, function (error) {
                    console.log(error);
                });
            }
        };

        $scope.editarRolMilitar = function () {
            if ($scope.rolMilitar.idRol && $scope.rolMilitar.nombreRol) {
                $http.put('api/roles_militares/' + id, JSON.stringify($scope.rolMilitar)).then(function (response) {
                    $scope.rolMilitar = {};
                    $state.reload();
                }, function (error) {
                    console.log(error);
                });
            }
        };
    }]);