var app = angular.module("RecursosMilitares");

app.config(["$stateProvider", "$urlRouterProvider", function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/dashboard');

        $stateProvider.state("dashboard", {
            url: '/dashboard',
            //donde se publica
            views: {
                sideBar: {
                    templateUrl: './js/componentesPrincipales/sideBar/sideBar.html',
                    controller: 'sideBarCtrl'
                },
                mainView: {
                    templateUrl: './js/dashboard/mostrar/dashboard.html',
                    controller: 'dashboardCtrl'
                },
                topBar:{
                    templateUrl: './js/componentesPrincipales/topBar.html'
                },
                popUp:{
                    templateUrl: './js/componentesPrincipales/popUp/popUp.html'
                }
            }
        });

        $stateProvider.state("listarRoles", {
            url: '/listarRoles',
            //donde se publica
            views: {
                mainView: {
                    templateUrl: './js/rolesMilitares/listar/listarRolesMilitares.html',
                    controller: 'listarRolesMilitaresCtrl'
                },
                sideBar: {
                    templateUrl: './js/componentesPrincipales/sideBar/sideBar.html',
                    controller: 'sideBarCtrl'
                },
                topBar:{
                    templateUrl: './js/componentesPrincipales/topBar.html'
                },
                popUp:{
                    templateUrl: './js/componentesPrincipales/popUp/popUp.html'
                }
            }
        });

        $stateProvider.state("listarRoles.addRol", {
            url: '/addRol',
            //donde se publica
            views: {
                addView: {
                    templateUrl: './js/rolesMilitares/crearEditar/crearEditarRolesMilitares.html',
                    controller: 'crearEditarRolMilitarCtrl'
                },sideBar: {
                    templateUrl: './js/componentesPrincipales/sideBar/sideBar.html',
                    controller: 'sideBarCtrl'
                },
                topBar:{
                    templateUrl: './js/componentesPrincipales/topBar.html'
                },
                popUp:{
                    templateUrl: './js/componentesPrincipales/popUp/popUp.html'
                }
            }
        });

        $stateProvider.state("listarRoles.editRol", {
            url: '/editRol/:rolMilitar',
            //donde se publica
            views: {
                addView: {
                    templateUrl: './js/rolesMilitares/crearEditar/crearEditarRolesMilitares.html',
                    controller: 'crearEditarRolMilitarCtrl'
                },sideBar: {
                    templateUrl: './js/componentesPrincipales/sideBar/sideBar.html',
                    controller: 'sideBarCtrl'
                },
                topBar:{
                    templateUrl: './js/componentesPrincipales/topBar.html'
                },
                popUp:{
                    templateUrl: './js/componentesPrincipales/popUp/popUp.html'
                }
            }
        });
        
        $stateProvider.state("listarMilitares", {
            url: '/listarMilitares',
            //donde se publica
            views: {
                mainView: {
                    templateUrl: './js/militares/listar/listarMilitares.html',
                    controller: 'listarMilitaresCtrl'
                },
                sideBar: {
                    templateUrl: './js/componentesPrincipales/sideBar/sideBar.html',
                    controller: 'sideBarCtrl'
                },
                topBar:{
                    templateUrl: './js/componentesPrincipales/topBar.html'
                },
                popUp:{
                    templateUrl: './js/componentesPrincipales/popUp/popUp.html'
                }
            }
        });

        $stateProvider.state("listarMilitares.addMilitar", {
            url: '/addMilitar',
            //donde se publica
            views: {
                addView: {
                    templateUrl: './js/militares/crearEditar/crearEditarMilitares.html',
                    controller: 'crearEditarMilitarCtrl'
                },sideBar: {
                    templateUrl: './js/componentesPrincipales/sideBar/sideBar.html',
                    controller: 'sideBarCtrl'
                },
                topBar:{
                    templateUrl: './js/componentesPrincipales/topBar.html'
                },
                popUp:{
                    templateUrl: './js/componentesPrincipales/popUp/popUp.html'
                }
            }
        });

        $stateProvider.state("listarMilitares.editMilitar", {
            url: '/editMilitar/:militar',
            //donde se publica
            views: {
                addView: {
                    templateUrl: './js/militares/crearEditar/crearEditarMilitares.html',
                    controller: 'crearEditarMilitarCtrl'
                },sideBar: {
                    templateUrl: './js/componentesPrincipales/sideBar/sideBar.html',
                    controller: 'sideBarCtrl'
                },
                topBar:{
                    templateUrl: './js/componentesPrincipales/topBar.html'
                },
                popUp:{
                    templateUrl: './js/componentesPrincipales/popUp/popUp.html'
                }
            }
        });

        $stateProvider.state("404", {
            url: '/404',
            //donde se publica
            views: {
                mainView: {
                    templateUrl: './js/componentesPrincipales/404.html'
                },sideBar: {
                    templateUrl: './js/componentesPrincipales/sideBar/sideBar.html'
                },
                topBar:{
                    templateUrl: './js/componentesPrincipales/topBar.html'
                },
                popUp:{
                    templateUrl: './js/componentesPrincipales/popUp/popUp.html'
                }
            }
        });

    }]);