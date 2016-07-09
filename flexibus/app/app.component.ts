import {Component, OnInit} from '@angular/core';
import {GuiManager} from './gui-manager';
import {GuiPart} from './gui-part';
import {ExampleOnePart} from './gui-example-one-part';
@Component({
    selector: 'my-app',
    templateUrl: 'app/app.component.html',
    styleUrls: ['app/app.component.css']
})
export class AppComponent implements OnInit {
    title = 'Flexibus';
    guiManager:GuiManager;
    ngOnInit() {
        this.guiManager = new GuiManager();
        this.guiManager.addGuiPart(new ExampleOnePart());
        console.log(this.guiManager.guiParts);
    }
    goToPart(guiPart:GuiPart){
        console.log('going to part ' + guiPart.id);
    }

}
