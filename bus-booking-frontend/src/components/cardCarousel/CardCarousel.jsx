import { Carousel } from "react-bootstrap";
import "./CardCarousel.css"; // Import your custom CSS file for styling
import CardImage from "../../assets/images/card.jpg";

function CardCarousel() {
  return (
    <Carousel className="custom-carousel" interval={1400}  indicators={false}>
      <Carousel.Item>
       
      
      </Carousel.Item>
      

     
    </Carousel>
  );
}

export default CardCarousel;
