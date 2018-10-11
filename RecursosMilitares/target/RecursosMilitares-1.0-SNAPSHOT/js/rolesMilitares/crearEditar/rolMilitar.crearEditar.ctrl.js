var rolMilitarModule = angular.module('rolMilitarModule');
//Asociar el controlador al modulo
rolMilitarModule.controller('crearEditarRolMilitarCtrl', ['$scope', '$http', '$state', contenido]);
function contenido($scope, $http, $state) {

    var id = $state.params.rolMilitar;

    document.getElementById("botonAgregar").style.visibility = "hidden";

    $scope.rolMilitar = {};

    if (id) {
        document.getElementById("botonAgregar").style.visibility = "visible";
        $http.get('api/roles_militares/' + id).then(function (response) {
            $scope.rolMilitar = response.data;
        }, function (error) {
            $state.go('404');
        });
    }

    $scope.crearRolMilitar = function () {
        document.getElementById("botonAgregar").style.visibility = "hidden";
        if ($scope.rolMilitar.nombreRol) {
            $http.post('api/roles_militares', JSON.stringify($scope.rolMilitar)).then(function (response) {
                $scope.rolMilitar = {};
                $state.reload();
            }, function (error) {
                $state.go('404');
            });
        }
    };

    $scope.editarRolMilitar = function () {
        if ($scope.rolMilitar.idRol && $scope.rolMilitar.nombreRol) {
            $http.put('api/roles_militares/' + id, JSON.stringify($scope.rolMilitar)).then(function (response) {
                $scope.rolMilitar = {};
                $state.reload();
            }, function (error) {
                $state.go('404');
            });
        }
    };

    $scope.cancelar = function () {
        document.getElementById("botonAgregar").style.visibility = "visible";
        $state.go("listarRoles");
    };
}