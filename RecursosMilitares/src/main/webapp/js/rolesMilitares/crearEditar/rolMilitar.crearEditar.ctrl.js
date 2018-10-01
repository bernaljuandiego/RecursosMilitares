var rolMilitarModule = angular.module('rolMilitarModule');
//Asociar el controlador al modulo
rolMilitarModule.controller('crearEditarRolMilitarCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        var id = $state.params.id;
        
        $scope.rolMilitar = {};
        
        if (id) {
            $http.get('api/roles_militares/' + id).then(function (response) {
                $scope.rolMilitar = response.data;
            }, function (error) {
                console.log(error);
            });
        }

        $scope.crearRolMIlitar = function () {
            if ($scope.rolMilitar.idRol && $scope.rolMilitar.nombreRol) {
                $http.post('api/roles_militares', JSON.stringify($scope.rolMilitar)).then(function (response) {
                    $scope.rolMilitar = {};
                    $state.go('listarRoles');
                }, function (error) {
                    console.log(error);
                });
            }
        };

        $scope.editarEstudiante = function () {
            if ($scope.rolMilitar.idRol && $scope.rolMilitar.nombreRol) {
                $http.put('api/roles_militares/' + id, JSON.stringify($scope.rolMilitar)).then(function (response) {
                    $scope.rolMilitar = {};
                    $state.go('listarRoles');
                }, function (error) {
                    console.log(error);
                });
            }
        };
    }]);