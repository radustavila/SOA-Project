import React, {useState} from "react"
import { JokesService } from "./JokesService"

export const Jokez = () => {

    const [jokeContent, setJokeContent] = useState();

    const handleClick = () => {
        JokesService.getJoke().then(
            (res) => {
                setJokeContent({setup: res.data.setup,
                            punchline: res.data.punchline})
            }
        )
    }
    return (
        <div style={{width: '65%', backgroundColor: 'yellow',
        height: '65%',display:"flex", flexDirection:"column", alignItems:"center", justifyContent:"center"}}>
            <button style={{marginTop:"10px", padding:"10px", width:"200px"}} onClick={handleClick}>Get Joke</button>
            {jokeContent && <div style={{textAlign:"center", fontSize:"15px", margin:"15px"}}>
                    {jokeContent.setup}
                    <br></br><br></br>
                    {jokeContent.punchline}
            </div>}
        </div>
    )
}