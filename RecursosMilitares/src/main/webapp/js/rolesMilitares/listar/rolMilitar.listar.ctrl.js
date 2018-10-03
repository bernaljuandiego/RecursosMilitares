var rolMilitarModule = angular.module('rolMilitarModule');
rolMilitarModule.controller('listarRolesMilitaresCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {

        $scope.rolesMilitares = new Array();

        $http.get('api/roles_militares').then(function (response) {
            $scope.rolesMilitares = response.data;
            $(document).ready(function () {
                $('#dataTable').DataTable();
            });
        }, function (error) {
            console.log(error);
        });

        $scope.eliminar = function (id) {
            $http.delete('api/roles_militares/' + id).then(function (response) {
                $state.reload();
            }, function (error) {
                $state.go('404')
                console.log(error);
            });
        }


    }]);

