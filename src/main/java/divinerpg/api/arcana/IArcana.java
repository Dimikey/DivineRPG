package divinerpg.api.arcana;

import net.minecraft.entity.player.EntityPlayer;

public interface IArcana {
    /**
     * Consumes arcana and sends packet
     * @param player - player
     * @param points - consuming amount
     */
    void consume(EntityPlayer player, float points);

    /**
     * Adds arcana and send packet
     * @param player - player
     * @param points - adding amount
     */
    void fill(EntityPlayer player, float points);

    /**
     * Called every tick. Adds single arcana and sends packet
      * @param player - player
     */
    void regen(EntityPlayer player);

    /**
     * Set arcana amount
     * @param points - count. Final amount can't be less 0 or more getMaxArcana()
     */
    void set(float points);

    /**
     * Get current arcana
     * @return amount of arcana
     */
    float getArcana();

    /**
     * Gets arcana max
     * @return amount of max possible arcana
     */
    float getMaxArcana();

    /**
     * Sets max amount of arcana for player
     *
     * @param max - arcana max. Can't be less zero
     */
    void setMaxArcana(float max);

    /**
     * Gets delay in ticks
     * @return - ticks count in which player can regen one arcana
     */
    int getRegenDelay();

    /**
     * Managing with arcana regen delay
     * @param delay - ticks count in which player can regen one arcana
     */
    void setRegenDelay(int delay);
}