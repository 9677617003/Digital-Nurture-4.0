
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(9, 'Geolocation for Event Mapping', 'Locate the nearest event to the user.', 'Practice geolocation.getCurrentPosition, error handling, and options.', 'Create a button “Find Nearby Events”; On click, use getCurrentPosition to get and display coordinates; Handle permission denial and timeouts; Use high accuracy options.');
