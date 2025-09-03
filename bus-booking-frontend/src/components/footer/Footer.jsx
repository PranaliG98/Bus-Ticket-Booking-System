// React Component

import {  SiInstagram, SiFacebook, SiGithub, SiLinkedin, SiTwitter, SiGoogle } from "react-icons/si";
import { FaBus } from "react-icons/fa";
import './Footer.css';

export default function App() {
  return (
    <footer className="footer">
      <section className="footer_section footer_section-social">
        <div className="footer_social">
        
        &nbsp;
        &nbsp;
        </div>
      </section>

      <section className="footer_section footer_content">
        <div className="footer_content-container">
          <h6 className="footer_content-heading">
            <FaBus/>&nbsp;
           Bus Booking System
          </h6>
          <p className="footer_content-paragraph">
            We are a Bus Reservation/Booking system developed primarily in ReactJs, Spring Boot and MySql 
          </p>
          {/* Other content goes here */}
        </div>
      </section>

      <div className="footer_copyright">
       
        &nbsp;
        &nbsp;
        &nbsp;
      </div>
    </footer>
  );
}
