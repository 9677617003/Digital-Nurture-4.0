console.log("Submitting form...");
const formData = { name: "User", email: "user@example.com" };
fetch("https://api.mock.com/form", {
    method: "POST",
    body: JSON.stringify(formData)
}).then(res => res.json())
.then(data => console.log(data))
.catch(err => console.error(err));