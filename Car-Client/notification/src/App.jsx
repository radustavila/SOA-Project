import React from "react";
import ReactDOM from "react-dom";
import { NotificationModal } from "./components/NotificationModal";

import "./index.css";

const App = () => (
  <div className="container">
  <h1>Notification....</h1>
      <NotificationModal />
  </div>
);
ReactDOM.render(<App />, document.getElementById("app"));
