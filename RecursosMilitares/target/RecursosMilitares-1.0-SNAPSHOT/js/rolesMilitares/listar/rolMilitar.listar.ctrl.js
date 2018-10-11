var rolMilitarModule = angular.module('rolMilitarModule');
rolMilitarModule.controller('listarRolesMilitaresCtrl', ['$scope', '$http', '$state', contenido]);
function contenido($scope, $http, $state) {

    var dato = new Date();
    $scope.fecha = "" + dato.getDay() + "/" + dato.getMonth() + "/" + dato.getFullYear() + " a las " + dato.getHours() + ":" + dato.getMinutes();

    $scope.rolesMilitares = new Array();

    $http.get('api/roles_militares').then(function (response) {
        $scope.rolesMilitares = response.data;
        $(document).ready(function () {
            $('#dataTable').DataTable();
        });
    }, function (error) {
        $state.go('404');
    });

    $scope.eliminar = function (id) {
        $http.delete('api/roles_militares/' + id).then(function (response) {
            $state.reload();
        }, function (error) {
            $("#logoutModal").toggleClass("modal");

        });
    };
}