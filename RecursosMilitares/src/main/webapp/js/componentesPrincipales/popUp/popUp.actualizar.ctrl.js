var componentesPrincipalesModule = angular.module('componentesPrincipalesModule');
componentesPrincipalesModule.controller('sideBarCtrl', ['$scope', '$http', '$state', contenido]);

function contenido($scope, $http, $state) {
    $scope.actualizarVentana = function (titulo, mensaje, boton) {
        document.getElementById("exampleModalLabel").innerHTML(titulo);
        document.getElementById("mensajePopUp").innerHTML(mensaje);
        document.getElementById("botonPopUp").innerHTML(boton);
    };
}