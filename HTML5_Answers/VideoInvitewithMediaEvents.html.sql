
CREATE TABLE IF NOT EXISTS html5_exercises (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    scenario TEXT,
    objective TEXT,
    tasks TEXT
);

INSERT INTO html5_exercises (id, title, scenario, objective, tasks) VALUES
(7, 'Video Invite with Media Events', 'Show a short event promo video.', 'Work with <video> and oncanplay event.', 'Insert a <video> element with source and controls; Use oncanplay to display a message like "Video ready to play"; Use onbeforeunload to warn users if they try to leave the form page unfinished.');
