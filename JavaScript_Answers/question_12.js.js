const userData = { name: "John", event: "Tech Talk" };
setTimeout(() => {
    fetch("https://api.mock.com/register", {
        method: "POST",
        body: JSON.stringify(userData),
        headers: { "Content-Type": "application/json" }
    }).then(res => res.json())
    .then(data => console.log("Success:", data))
    .catch(err => console.error("Failed:", err));
}, 2000);