const add = document.getElementById('add');
const input = document.getElementById('input');
const notes = document.getElementById('notes');

function addNote() {
    if (input.value === '') {
        alert('Please enter a note');
        return;
    }
    const note = document.createElement('div');
    note.classList.add('note');
    note.innerText = input.value;
    notes.appendChild(note);
    input.value = '';
    const deleteBtn = document.createElement('button');
    deleteBtn.classList.add('delete');
    deleteBtn.innerHTML = '<i class="fas fa-trash-alt">Delete</i>';
    note.appendChild(deleteBtn);
    deleteBtn.addEventListener('click', () => {
        note.remove();
    });
    const editBtn = document.createElement('button');
    editBtn.classList.add('edit');
    editBtn.innerHTML = '<i class="fas fa-edit">Edit</i>';
    note.appendChild(editBtn);
    editBtn.addEventListener('click', () => {
        input.value = note.innerText;
        note.remove();
    });
    const completeBtn = document.createElement('button');
    completeBtn.classList.add('complete');
    completeBtn.innerHTML = '<i class="fas fa-check">Complete</i>';
    note.appendChild(completeBtn);
    completeBtn.addEventListener('click', () => {
        note.classList.add('completed');
    });
}

add.addEventListener('click', addNote);