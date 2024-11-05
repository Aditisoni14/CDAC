let menubar = document.querySelector('#menu-bars');
let navbar  = document.querySelector('.navbar');

menubar.onclick = () =>{
    menubar.classList.toggle('fa-times');
    navbar.classList.toggle('active')
}


/*let appointments = []; // Array to store appointments

document.getElementById('appointmentForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the default form submission

    const patientName = document.getElementById('patientName').value;
    const doctorName = document.getElementById('doctorName').value;
    const appointmentDate = document.getElementById('appointmentDate').value;
    const appointmentTime = document.getElementById('appointmentTime').value;

    //  appointment object
    const appointment = {
        id: appointments.length + 1,
        patientName,
        doctorName,
        appointmentDate,
        appointmentTime
    };

    // Add appointment to the array
    appointments.push(appointment);
    alert('Appointment booked successfully!');

    // Reset the form
    document.getElementById('appointmentForm').reset();
});*/