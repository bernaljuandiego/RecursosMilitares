var militarModule = angular.module('militarModule');
militarModule.controller('listarMilitaresCtrl', ['$scope', '$http', '$state', contenido]);
function contenido($scope, $http, $state) {
    var dato = new Date();
    $scope.fecha = "" + dato.getDay() + "/" + dato.getMonth() + "/" + dato.getFullYear() + " a las " + dato.getHours() + ":" + dato.getMinutes();

    $scope.militares = new Array();

    $http.get('api/militares').then(function (response) {
        $scope.militares = response.data;
        $(document).ready(function () {
            $('#dataTable').DataTable();
        });
    }, function (error) {
        $state.go('404');
    });

    $scope.eliminar = function (id) {
        $http.delete('api/militares/' + id).then(function (response) {
            $state.reload();
        }, function (error) {
            $("#logoutModal").toggleClass("modal");
            console.log(error);
        });
    };
}