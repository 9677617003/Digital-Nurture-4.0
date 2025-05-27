document.querySelector("form").onsubmit = function(e) {
    e.preventDefault();
    const name = e.target.elements.name.value;
    const email = e.target.elements.email.value;

    if (!name || !email) {
        document.querySelector("#error").textContent = "All fields required";
        return;
    }

    console.log("Submitted:", name, email);
};