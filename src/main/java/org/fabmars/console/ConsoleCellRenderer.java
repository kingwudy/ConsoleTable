package org.fabmars.console;

/**
 * Created by mars on 27/09/2016.
 */
public interface ConsoleCellRenderer<T> {

  /**
   * @param value
   * @param row -1 when drawing the header
   * @param column
   * @return
   */
  String render(T value, int row, int column);
}
