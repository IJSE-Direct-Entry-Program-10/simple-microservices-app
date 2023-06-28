import express from 'express';

export const router = express.Router();

router.delete('/:isbn', (req, res) => {
    res.send("<h1>Delete a book</h1>");
});

router.patch('/:isbn', (req, res) => {
    res.send("<h1>Update a book</h1>");
});