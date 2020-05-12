/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sliding.login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 *
 * @author Quado
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @FXML
    private Pane pane5;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       pane1.setStyle("-fx-background-image: url(\"/sliding/login/images/hospital-background.jpg\")");
       pane2.setStyle("-fx-background-image: url(\"/sliding/login/images/hospital2.jpg\")");
       pane3.setStyle("-fx-background-image: url(\"/sliding/login/images/hospital3.jpg\")");
       pane4.setStyle("-fx-background-image: url(\"/sliding/login/images/hospital4.jpg\")");
       pane5.setStyle("-fx-background-image: url(\"/sliding/login/images/hospital5.jpg\")");
       
       backgroundAnimation();
    }    

    private void backgroundAnimation() {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(7), pane5);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();
        
        fadeTransition.setOnFinished(event -> {
            FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(5), pane4);
            fadeTransition1.setFromValue(1);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();
            
            fadeTransition1.setOnFinished(event1 -> {
                FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(4), pane3);
                fadeTransition2.setFromValue(1);
                fadeTransition2.setToValue(0);
                fadeTransition2.play();
            
                fadeTransition2.setOnFinished(event2 -> {
                    FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(4), pane2);
                    fadeTransition3.setFromValue(1);
                    fadeTransition3.setToValue(0);
                    fadeTransition3.play();

                    fadeTransition3.setOnFinished(event3 -> {
                        FadeTransition fadeTransition33 = new FadeTransition(Duration.seconds(4), pane2);
                        fadeTransition33.setFromValue(0);
                        fadeTransition33.setToValue(1);
                        fadeTransition33.play();

                        fadeTransition33.setOnFinished(event4 -> {
                            FadeTransition fadeTransition22 = new FadeTransition(Duration.seconds(4), pane3);
                            fadeTransition22.setFromValue(0);
                            fadeTransition22.setToValue(1);
                            fadeTransition22.play();
                            
                    
                         fadeTransition22.setOnFinished(event5 -> {
                            FadeTransition fadeTransition11 = new FadeTransition(Duration.seconds(4), pane4);
                            fadeTransition11.setFromValue(0);
                            fadeTransition11.setToValue(1);
                            fadeTransition11.play();
                            
                            fadeTransition11.setOnFinished(event6 -> {
                                FadeTransition fadeTransition0 = new FadeTransition(Duration.seconds(4), pane5);
                                fadeTransition0.setFromValue(0);
                                fadeTransition0.setToValue(1);
                                fadeTransition0.play();
                                
                                fadeTransition0.setOnFinished(event7 -> {
                                   backgroundAnimation();
                                    });
                                });
                            });   
                        });
                    });
                });
            });
        });
    }
    
}
