// JavaScript Document
loop;
{
    var enemy = this.findNearestEnemy();
    var dist = this.distanceTo(enemy);
    var pos = enemy.pos;
    var x = pos.x;
    var y = pos.y;
    var newX = this.pos.x + 5;
    var newY = this.pos.y + 5;
    if (enemy) {
        if (dist < 10) {
            if (this.isReady("cleave"))
                this.cleave(enemy);
            else {
                this.moveXY(newX, newY);
                this.shield();
            }
            if (this.isReady("attack"))
                this.attack(enemy);
            else {
                this.moveXY(newX, newY);
                this.shield();
            }
        } else
            this.attack(enemy);
    }
}
