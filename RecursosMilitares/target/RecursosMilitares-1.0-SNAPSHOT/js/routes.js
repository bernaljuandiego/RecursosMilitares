//Llamar la aplicacion creada en app.js
var app = angular.module("RecursosMilitares");

app.config(["$stateProvider", "$urlRouterProvider", function ($stateProvider, $urlRouterProvider){
    
    $urlRouterProvider.otherwise('/');
    
    $stateProvider.state("dashboard",{
       url: '/',
       //donde se publica
       views: {
           mainView:{
               templateUrl: './js/dashboard/mostrar/dashboard.html',
               controller: 'dashboardCtrl'
           }
       }
    });
    
    $stateProvider.state("listarRoles",{
       url: '/listarRoles',
       //donde se publica
       views: {
           mainView:{
               templateUrl: './js/rolesMilitares/listar/listarRolesMilitares.html',
               controller: 'listarRolesMilitaresCtrl'
           }
       }
    });
}]);