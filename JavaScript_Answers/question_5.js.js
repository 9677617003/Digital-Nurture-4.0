function Event(name, date, seats) {
    this.name = name;
    this.date = date;
    this.seats = seats;
}

Event.prototype.checkAvailability = function() {
    return this.seats > 0;
};

const myEvent = new Event("Workshop", "2025-08-01", 30);
console.log(Object.entries(myEvent));