import React, { useEffect } from "react";
import useWebSocket from 'react-use-websocket';


const WS_URL = 'ws://localhost:8081/ws';
const WS_URL_NOTIF = 'ws://localhost:8081/ws/app/notification';
export const NotificationModal = () => {

  useWebSocket(WS_URL, {
    onOpen: () => {
      console.log('WebSocket connection established!.');
    },
    onMessage: (event) => {
        console.log(event)
    }
  });

  return (
    <div style={{
        width: '65%',
        height: '65%',
        backgroundColor: 'skyblue',
        textAlign: "center"
      }}>
        <h5>Placeholder for Notif...</h5>
    </div>
  );
}

