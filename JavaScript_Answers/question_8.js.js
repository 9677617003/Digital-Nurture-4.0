document.querySelector("#registerBtn").onclick = function() {
    alert("Registered!");
};

document.querySelector("#categorySelect").onchange = function(e) {
    console.log("Selected:", e.target.value);
};

document.querySelector("#searchInput").onkeydown = function(e) {
    console.log("Key pressed:", e.key);
};