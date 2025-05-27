const events = [{ name: "Yoga", seats: 5 }];
function showEvent({ name, seats } = {}) {
    console.log(`Event: ${name}, Seats: ${seats}`);
}

const newList = [...events];
showEvent(events[0]);