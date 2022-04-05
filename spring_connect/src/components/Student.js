import React, { useState, useEffect } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container, Paper, Button } from '@mui/material';

export default function Student() {
    const paperStyle = { padding: '50px 20px', width: 600, margin: '20px auto' };
    const [name, setName] = React.useState('');
    const [address, setAddress] = useState('');
    const [students, setStudents] = useState([]);

    const handleClick = (e) => {
        e.preventDefault();
        const student = { name, address };
        fetch("http://localhost:8080/student/add", {
            method: 'POST',
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(student)

        }).then(() => {
            console.log("New Student added successfully");
        })
    }
    useEffect(() => {
        fetch("http://localhost:8080/student/getAll")
            .then(res => res.json())
            .then(result => {
                setStudents(result);
            })
    }, [students])
    return (
        <Container>
            <Paper elevation={3} style={paperStyle}>
                <h1 style={{ color: '#1976d2' }}><b>ADD STUDENT</b></h1>
                <Box
                    component="form"
                    sx={{
                        '& > :not(style)': { m: 1 },
                    }}
                    noValidate
                    autoComplete="off"
                >
                    <TextField id="outlined-basic" color="secondary" label="Student Name" fullWidth
                        value={name}
                        onChange={(e) => (setName(e.target.value))}
                    />
                    <TextField id="standard-basic" color="secondary" label="Student Address" fullWidth
                        value={address}
                        onChange={(e) => (setAddress(e.target.value))}
                    />
                    <Button variant="contained" onClick={handleClick}>Submit</Button>
                </Box>
                {name}
                {address}
            </Paper>
            <Paper elevation={3} style={paperStyle}>
                <h1 style={{ color: '#1976d2' }}><b>STUDENTS</b></h1>
                    {students.map((student) =>(
                        <Paper elevation={6} style={{margin:"10px",padding:"15px",textAlign: 'left'}} key={student.id}>
                            Id: {student.id}<hr/>
                            Name: {student.name}<hr/>
                            Address: {student.address}
                        </Paper>
                    ))}
            </Paper>
        </Container>
    );
}
