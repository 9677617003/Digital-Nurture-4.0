const events = [
    { name: "Music Fest", date: "2025-07-10", seats: 10 },
    { name: "Old Event", date: "2024-01-01", seats: 0 }
];

events.forEach(event => {
    if (new Date(event.date) > new Date() && event.seats > 0) {
        console.log(`Upcoming: ${event.name}`);
    }
});

function register(event) {
    try {
        if (event.seats <= 0) throw "No seats available!";
        event.seats--;
        console.log("Registered successfully");
    } catch (error) {
        console.error(error);
    }
}