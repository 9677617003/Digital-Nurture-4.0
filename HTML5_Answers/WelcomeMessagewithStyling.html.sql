
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(3, 'Welcome Message with Styling and ID/Class', 'Display a welcome banner styled uniquely for a logged-in user.', 'Practice block/inline tags and differentiate id and class.', 'Use <div id="welcomeBanner"> and apply a blue background via internal CSS; Use inline styles for a special offer <span> (e.g., color red, bold); Apply the .highlight class to certain elements for visual emphasis.');
