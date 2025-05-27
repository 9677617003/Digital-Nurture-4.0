fetch("https://api.mock.com/events")
    .then(res => res.json())
    .then(data => console.log(data))
    .catch(err => console.error(err));

async function fetchEvents() {
    try {
        const res = await fetch("https://api.mock.com/events");
        const data = await res.json();
        console.log(data);
    } catch (err) {
        console.error(err);
    }
}