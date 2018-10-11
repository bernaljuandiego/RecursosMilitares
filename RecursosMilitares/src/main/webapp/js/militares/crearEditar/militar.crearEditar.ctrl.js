var militarModule = angular.module('militarModule');
//Asociar el controlador al modulo
militarModule.controller('crearEditarMilitarCtrl', ['$scope', '$http', '$state', contenido]);

function contenido($scope, $http, $state) {
    id = $state.params.militar;

    document.getElementById("botonAgregar").style.visibility = "hidden";

    $scope.rolesMilitares = new Array();
    $scope.militar = {};
    $scope.militares = new Array();

    if (id) {
        document.getElementById("botonAgregar").style.visibility = "visible";
        $http.get('api/militares/' + id).then(function (response) {
            $scope.militar = response.data;
        }, function (error) {
            $state.go('404');
        });
    }

    $http.get('api/roles_militares').then(function (response) {
        $scope.rolesMilitares = response.data;
    }, function (error) {
        $state.go('404');
    });

    $http.get('api/militares').then(function (response) {
        $scope.militares = response.data;
    }, function (error) {
        $state.go('404');
    });

    $scope.crearMilitar = function () {
        document.getElementById("botonAgregar").style.visibility = "hidden";
        console.log($scope.militar);
        if ($scope.militar.nombreMilitar && $scope.militar.apellidoMilitar) {
            $http.post('api/militares', JSON.stringify($scope.militar)).then(function (response) {
                $scope.militar = {};
                $state.reload();
            }, function (error) {
                $state.go('404');
            });
        }
    };

    $scope.editarMilitar = function () {
        if ($scope.militar.nombreMilitar && $scope.militar.apellidoMilitar) {
            $http.put('api/militares/' + id, JSON.stringify($scope.rolMilitar)).then(function (response) {
                $scope.militar = {};
                $state.reload();
            }, function (error) {
                $state.go('404');
            });
        }
    };

    $scope.cancelar = function () {
        document.getElementById("botonAgregar").style.visibility = "visible";
        $state.go("listarMilitares");
    };
}