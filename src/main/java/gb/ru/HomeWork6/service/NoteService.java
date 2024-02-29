package gb.ru.HomeWork6.service;


import gb.ru.HomeWork6.model.Note;

import java.util.List;

public interface NoteService {
    Note createNote(Note note);
    List<Note> getAllNote();
    Note getNoteById(Long id);
    Note updeteNote(Note note);
    void deleteNote(Long id);
}