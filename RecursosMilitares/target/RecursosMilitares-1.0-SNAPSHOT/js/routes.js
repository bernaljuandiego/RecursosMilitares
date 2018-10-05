//Llamar la aplicacion creada en app.js
var app = angular.module("RecursosMilitares");

app.config(["$stateProvider", "$urlRouterProvider", function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/dashboard');

        $stateProvider.state("dashboard", {
            url: '/dashboard',
            //donde se publica
            views: {
                mainView: {
                    templateUrl: './js/dashboard/mostrar/dashboard.html',
                    controller: 'dashboardCtrl'
                }
            }
        });

        $stateProvider.state("listarRoles", {
            url: '/listarRoles',
            //donde se publica
            views: {
                mainView: {
                    templateUrl: './js/rolesMilitares/listar/listarRolesMilitares.html',
                    controller: 'listarRolesMilitaresCtrl',
                }
            }
        });

        $stateProvider.state("listarRoles.addRol", {
            url: '/addRol',
            //donde se publica
            views: {
                addView: {
                    templateUrl: './js/rolesMilitares/crearEditar/crearEditarRolesMilitares.html',
                    controller: 'crearEditarRolMilitarCtrl',
                }
            }
        });

        $stateProvider.state("listarRoles.editRol", {
            url: '/editRol/:rolMilitar',
            //donde se publica
            views: {
                addView: {
                    templateUrl: './js/rolesMilitares/crearEditar/crearEditarRolesMilitares.html',
                    controller: 'crearEditarRolMilitarCtrl',
                }
            }
        });

        $stateProvider.state("404", {
            url: '/404',
            //donde se publica
            views: {
                mainView: {
                    templateUrl: '404.html'
                }
            }
        });

    }]);