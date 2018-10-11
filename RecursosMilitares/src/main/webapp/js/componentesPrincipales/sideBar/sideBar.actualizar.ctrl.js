var componentesPrincipalesModule = angular.module('componentesPrincipalesModule');
componentesPrincipalesModule.controller('sideBarCtrl', ['$scope', '$http', '$state', contenido]);

function contenido($scope, $http, $state) {
    switch ($state.current.name) {
        case 'dashboard':
            var nav = document.getElementById("itemDashboard");
            nav.classList.add('active');
            break;
        case 'listarRoles':
            var nav = document.getElementById("itemAdministracion");
            var menu = document.getElementById("menuAdministracion");
            var opcion = document.getElementById("opcionRoles");
            nav.classList.add('active');
            nav.classList.add('show');
            menu.classList.add('show');
            opcion.classList.add('active');
            break;
        case 'listarMilitares':
            var nav = document.getElementById("itemAdministracion");
            var menu = document.getElementById("menuAdministracion");
            var opcion = document.getElementById("opcionMilitares");
            nav.classList.add('active');
            nav.classList.add('show');
            menu.classList.add('show');
            opcion.classList.add('active');
            break;
        default :
            break;
    }

    "use strict";

    $(document.getElementById("sidebarToggle")).on('click', function (e) {
        e.preventDefault();
        $("body").toggleClass("sidebar-toggled");
        $(".sidebar").toggleClass("toggled");
    });

    $('body.fixed-nav .sidebar').on('mousewheel DOMMouseScroll wheel', function (e) {
        if ($(window).width() > 768) {
            var e0 = e.originalEvent,
                    delta = e0.wheelDelta || -e0.detail;
            this.scrollTop += (delta < 0 ? 1 : -1) * 30;
            e.preventDefault();
        }
    });

    // Scroll to top button appear
    $(document).on('scroll', function () {
        var scrollDistance = $(this).scrollTop();
        if (scrollDistance > 100) {
            $('.scroll-to-top').fadeIn();
        } else {
            $('.scroll-to-top').fadeOut();
        }
    });

    // Smooth scrolling using jQuery easing
    $(document).on('click', 'a.scroll-to-top', function (event) {
        var $anchor = $(this);
        $('html, body').stop().animate({
            scrollTop: ($($anchor.attr('href')).offset().top)
        }, 1000, 'easeInOutExpo');
        event.preventDefault();
    });
}