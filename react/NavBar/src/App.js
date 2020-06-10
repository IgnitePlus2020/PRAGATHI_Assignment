import React from 'react';
import './App.css';
import * as RBS from 'react-bootstrap';
import pic from './pic.jpeg' 

function App() {
  return (
    <div className="App">
      <RBS.Navbar bg="primary" expand="md">
  <RBS.Navbar.Brand href="#home">ALL IN ONE</RBS.Navbar.Brand>
  <RBS.Navbar.Toggle aria-controls="basic-navbar-nav" />
  <RBS.Navbar.Collapse id="basic-navbar-nav">
    <RBS.Nav className="mr-auto">
      <RBS.NavDropdown title="Shopping" id="basic-nav-dropdown">
        <RBS.NavDropdown.Item href="https://www.myntra.com">Myntra</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://www.target.com">Target</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://www.amazon.com">Amazon</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://www.flipkart.com">Flipkart</RBS.NavDropdown.Item>
      </RBS.NavDropdown>
      <RBS.NavDropdown title="Mailing" id="basic-nav-dropdown">
        <RBS.NavDropdown.Item href="https://www.gmail.com">G-mail</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://in.yahoo.com">Yahoo</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://outlook.live.com">Outlook</RBS.NavDropdown.Item>
      </RBS.NavDropdown>
      <RBS.NavDropdown title="Movies" id="basic-nav-dropdown">
        <RBS.NavDropdown.Item href="https://www.youtube.com">Youtube</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://www.netflix.com">Netflix</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://www.primevideo.com">Amazon Prime</RBS.NavDropdown.Item>
      </RBS.NavDropdown>
      <RBS.Nav.Link href="https://www.google.co.in">Google</RBS.Nav.Link>
      <RBS.NavDropdown title="Social Media" id="basic-nav-dropdown">
        <RBS.NavDropdown.Item href="https://m.facebook.com">Facebook</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://www.instagram.com">Instagram</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://mobile.twitter.com">Twitter</RBS.NavDropdown.Item>
        <RBS.NavDropdown.Item href="https://web.whatsapp.com/">WhatsApp web</RBS.NavDropdown.Item>
      </RBS.NavDropdown>
    </RBS.Nav>
  </RBS.Navbar.Collapse>
</RBS.Navbar>
<img src={pic} align="centre" width="1000" height="450" ></img>
    </div>
  );
}

export default App;
