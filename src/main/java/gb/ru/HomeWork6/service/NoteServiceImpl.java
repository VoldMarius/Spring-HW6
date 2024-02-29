package gb.ru.HomeWork6.service;

import gb.ru.HomeWork6.model.Note;
import gb.ru.HomeWork6.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService{
    public final NoteRepository noteRepository;

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNote() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Note updeteNote(Note note) {
        Note noteById = getNoteById(note.getId());
        noteById.setTitle(note.getTitle());
        noteById.setContent(note.getContent());
        return noteRepository.save(noteById);
    }

    @Override
    public void deleteNote(Long id) {
        Note noteById = getNoteById(id);
        noteRepository.delete(noteById);
    }
}