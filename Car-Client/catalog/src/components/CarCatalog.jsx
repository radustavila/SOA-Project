import React, { useState } from "react";
import { CarCatalogService } from "../services/CarCatalogService";
import "./table.css"


export const CarCatalog = () => {
    console.log("hey")
    const [tableContent, setTableContent] = useState();

    const callCarCatalogAPI = () => {
        CarCatalogService.getCatalog().then(
            (res) => {
                console.log(res.data)
                setTableContent(
                    <table align="center">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Price</th>
                                <th>Horse Power</th>
                            </tr>
                        </thead>
                        <tbody>
                        {res.data.map((item) => (
                            <tr key={item.name}>
                                <td align="center">{item.name}</td>
                                <td align="center">{item.price}</td>
                                <td align="center">{item.hp}</td>
                            </tr>
                        ))}
                        </tbody>
                    </table>
                )
                console.log(res)
            }
        )
    }

    useState(() => {
        callCarCatalogAPI()
    })

    return (
        <div>
            {tableContent}
        </div>
    );
}