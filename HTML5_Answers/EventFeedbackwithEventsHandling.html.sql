
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(6, 'Event Feedback with Events Handling', 'Collect real-time feedback and interactions from the user.', 'Handle blur, change, click, double-click, and keyboard events.', 'Use onblur to validate a phone number field; Use onchange on a dropdown to display the selected event fee; onclick on a submit button to show a confirmation; ondblclick on an image to enlarge it; Capture key events in the feedback textarea and count characters.');
