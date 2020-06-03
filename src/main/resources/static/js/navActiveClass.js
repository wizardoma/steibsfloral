function addClassToNav(menuItemID) {
    alert(menuItemID);
    var element = document.getElementById(menuItemID);
    element.classList.add("current-menu-item");
}
