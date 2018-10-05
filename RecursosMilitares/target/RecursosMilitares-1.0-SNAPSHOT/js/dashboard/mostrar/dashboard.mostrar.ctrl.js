var dashboardModule = angular.module('dashboardModule');
dashboardModule.controller('dashboardCtrl', ['$scope', '$http', '$state', function ($scope, $http, $state) {
        
        var rolesMilitares = new Array();
        var dato = new Date();
        $scope.fecha = ""+dato.getDay()+"/"+dato.getMonth()+"/"+dato.getFullYear()+" a las "+dato.getHours()+":"+dato.getMinutes();
        
        $http.get('api/roles_militares').then(function (response) {
            rolesMilitares = response.data;
            addData(rolesMilitares);
            $scope.cantidadRoles = rolesMilitares.length;
        }, function (error) {
            $state.go('404');
        });

        
        
        function addData(rolesMilitares) {
            for (var i = 0; i < rolesMilitares.length; i++) {
                data.labels[data.labels.length] = rolesMilitares[i].nombreRol;
                data.datasets[0].data[data.datasets[0].data.length] = rolesMilitares[i].idRol;
            }
            crearGrafico();
        }

        var data = {
            labels: [],
            datasets: [{
                    label: "Roles Militares",
                    lineTension: 0.3,
                    backgroundColor: "rgba(153,4,7,0.2)",
                    borderColor: "rgba(153,4,7,1)",
                    pointRadius: 5,
                    pointBackgroundColor: "rgba(153,4,7,1)",
                    pointBorderColor: "rgba(255,255,255,0.8)",
                    pointHoverRadius: 5,
                    pointHoverBackgroundColor: "rgba(153,4,7,1)",
                    pointHitRadius: 50,
                    pointBorderWidth: 2,
                    data: [],
                }],
        };

        function crearGrafico() {
            Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
            Chart.defaults.global.defaultFontColor = '#292b2c';
            var ctx = document.getElementById("myAreaChart");
            var myLineChart = new Chart(ctx, {
                type: 'line',
                data: data,
                options: {
                    scales: {
                        xAxes: [{
                                gridLines: {
                                    display: false
                                }
                            }],
                        yAxes: [{
                                
                                gridLines: {
                                    color: "rgba(0, 0, 0, .125)",
                                }
                            }],
                    },
                    legend: {
                        display: true,
                        
                        
                    }
                }
            });
        }
    }]);